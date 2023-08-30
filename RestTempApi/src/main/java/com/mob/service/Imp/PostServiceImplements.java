package com.mob.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mob.op.PostOfficeDetails;
import com.mob.op.PostOfficeResponceBean;
import com.mob.serv.PostService;

@Service
public class PostServiceImplements implements PostService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public PostOfficeResponceBean getByCity(String city) {
		String url="https://api.postalpincode.in/postoffice/{city}";
		url=url.replace("{city}", city);
		System.out.println(url);
		ResponseEntity<PostOfficeResponceBean[]> responseEntity=restTemplate.getForEntity(url, PostOfficeResponceBean[].class);
		PostOfficeResponceBean[] responseBeanArray=responseEntity.getBody();
		for(PostOfficeResponceBean responseBean:responseBeanArray)
		{
			List<PostOfficeDetails> postOfficeDetails=responseBean.getPostOffice();
			for(PostOfficeDetails postOfficeDetails1:postOfficeDetails)
			{
				System.out.println(postOfficeDetails1);
			}
		}
		return responseBeanArray[0];
	}

}
