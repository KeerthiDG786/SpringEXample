package com.mob.serv;

import com.mob.op.PostOfficeResponceBean;

public interface PostService {
	
	PostOfficeResponceBean getByCity(String city);

}
