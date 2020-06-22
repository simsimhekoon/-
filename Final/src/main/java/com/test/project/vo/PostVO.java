package com.test.project.vo;

public class PostVO {

    int postNum;
    String title;
    String userID;
    String contents;
    String uploadDate;

    public int getPostNum() {
        return postNum;
    }
    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getReg_dt() {
        return uploadDate;
    }
    public void setReg_dt(String uploadDate) {
        this.uploadDate = uploadDate;
    }


}
