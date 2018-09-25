package model;

import java.util.Date;
import java.util.List;

public class Article {


	public static final String REVIEW = "C";

	private String articleId;

	private String codeCd;

	private String articleEnNo;

	private String articleFnNo;

	private String articleKiNo;

	private String articleEnTitle;

	private String articleFnTitle;

	private String articleKiTitle;

	private int articlePage;

	private int articleSeq;

	private String orgnztId;

	private String orgnztNm;

	private String regstrId;

	private String regstrNm;

	private Date regstrDt;

	private String modfrId;

	private String modfrNm;

	private Date modfrDt;

	private String delYn;

	private String atchFileId;

	private String comment;

	private List attachFileList;

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getCodeCd() {
		return codeCd;
	}

	public void setCodeCd(String codeCd) {
		this.codeCd = codeCd;
	}

	public String getArticleEnNo() {
		return articleEnNo;
	}

	public void setArticleEnNo(String articleEnNo) {
		this.articleEnNo = articleEnNo;
	}

	public String getArticleFnNo() {
		return articleFnNo;
	}

	public void setArticleFnNo(String articleFnNo) {
		this.articleFnNo = articleFnNo;
	}

	public String getArticleKiNo() {
		return articleKiNo;
	}

	public void setArticleKiNo(String articleKiNo) {
		this.articleKiNo = articleKiNo;
	}

	public String getArticleEnTitle() {
		return articleEnTitle;
	}

	public void setArticleEnTitle(String articleEnTitle) {
		this.articleEnTitle = articleEnTitle;
	}

	public String getArticleFnTitle() {
		return articleFnTitle;
	}

	public void setArticleFnTitle(String articleFnTitle) {
		this.articleFnTitle = articleFnTitle;
	}

	public String getArticleKiTitle() {
		return articleKiTitle;
	}

	public void setArticleKiTitle(String articleKiTitle) {
		this.articleKiTitle = articleKiTitle;
	}

	public int getArticlePage() {
		return articlePage;
	}

	public void setArticlePage(int articlePage) {
		this.articlePage = articlePage;
	}

	public int getArticleSeq() {
		return articleSeq;
	}

	public void setArticleSeq(int articleSeq) {
		this.articleSeq = articleSeq;
	}

	public String getOrgnztId() {
		return orgnztId;
	}

	public void setOrgnztId(String orgnztId) {
		this.orgnztId = orgnztId;
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

	public Date getRegstrDt() {
		return regstrDt;
	}

	public void setRegstrDt(Date regstrDt) {
		this.regstrDt = regstrDt;
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

	public Date getModfrDt() {
		return modfrDt;
	}

	public void setModfrDt(Date modfrDt) {
		this.modfrDt = modfrDt;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getAtchFileId() {
		return atchFileId;
	}

	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List getAttachFileList() {
		return attachFileList;
	}

	public void setAttachFileList(List attachFileList) {
		this.attachFileList = attachFileList;
	}

	public String getOrgnztNm() {
		return orgnztNm;
	}

	public void setOrgnztNm(String orgnztNm) {
		this.orgnztNm = orgnztNm;
	}
}
