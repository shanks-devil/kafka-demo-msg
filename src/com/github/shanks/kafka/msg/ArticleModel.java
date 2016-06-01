package com.github.shanks.kafka.msg;

import lombok.Data;

@Data
public class ArticleModel {

	private Integer articleId;
	
	private String articleCode;
	
	private String context;
	
}
