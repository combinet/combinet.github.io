package model;

import java.util.Date;

public class Gazette {
    private String gazetteId;
    
    private String codeCd;  
    
    private String gazetteNm;
    
    private String regstrId;
    
    private String regstrNm;
    
    private Date regstrDate;
    
    private String modfrId;
    
    private String modfrNm;
    
    private Date modfrDate;
    
    private String delYn; 
    
    private Date publishDate;
    
    private String comment;

	public String getGazetteId() {
		return gazetteId;
	}

	public void setGazetteId(String gazetteId) {
		this.gazetteId = gazetteId;
	}

	public String getCodeCd() {
		return codeCd;
	}

	public void setCodeCd(String codeCd) {
		this.codeCd = codeCd;
	}

	public String getGazetteNm() {
		return gazetteNm;
	}

	public void setGazetteNm(String gazetteNm) {
		this.gazetteNm = gazetteNm;
	}

	public String getRegstrId() {
		return regstrId;
	}

	public void setRegstrId(String regstrId) {
		this.regstrId = regstrId;
	}

	public String getRegstrNm() {
		return regstrNm;
	}

	public void setRegstrNm(String regstrNm) {
		this.regstrNm = regstrNm;
	}

	public Date getRegstrDate() {
		return regstrDate;
	}

	public void setRegstrDate(Date regstrDate) {
		this.regstrDate = regstrDate;
	}

	public String getModfrId() {
		return modfrId;
	}

	public void setModfrId(String modfrId) {
		this.modfrId = modfrId;
	}

	public String getModfrNm() {
		return modfrNm;
	}

	public void setModfrNm(String modfrNm) {
		this.modfrNm = modfrNm;
	}

	public Date getModfrDate() {
		return modfrDate;
	}

	public void setModfrDate(Date modfrDate) {
		this.modfrDate = modfrDate;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
