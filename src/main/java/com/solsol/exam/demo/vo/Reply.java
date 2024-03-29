package com.solsol.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

	private int id;
	private String relTypeCode;
	private int memberId;
	private String body;
	private String regDate;
	private String updateDate;
	private int relId;
	private int hitCount;
	private int goodReactionPoint;
	private int badReactionPoint;
	
	
	private String extra__writerName;
	private boolean extra__actorCanModify;
	private boolean extra__actorCanDelete;
	
	public String getForPrintType1RegDate(){
		return regDate.substring(2, 16).replace(" ", "<br>");
	}
	
	public String getForPrintType1UpdateDate(){
		return regDate.substring(2, 16).replace(" ", "<br>");
	}
	
	public String getForPrintType2RegDate(){
		return regDate.substring(2, 16);
	}
	
	public String getForPrintType2UpdateDate(){
		return regDate.substring(2, 16);
	}
	
	public String getForPrintBody() {
		return body.replaceAll("\n", "<br>");
	}
}