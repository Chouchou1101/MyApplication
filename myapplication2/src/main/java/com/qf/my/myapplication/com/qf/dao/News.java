package com.qf.my.myapplication.com.qf.dao;

/**
 * Created by my on 2016/6/24.
 */
public class News {
    private String id;
    private String typeid;
    private String typeid2;
    private String sortrank;
    private String flag;
    private String ismake;
    private String channel;
    private String arcrank;
    private String click;
    private String money;
    private String title;
    private String shorttitle;
    private String color;
    private String writer;
    private String source;
    private String litpic;
    private String pubdate;
    private String senddate;
    private String mid;
    private String keywords;
    private String lastpost;
    private String scores;
    private String goodpost;
    private String badpost;
    private String voteid;
    private String notpost;
    private String description;
    private String filename;
    private String dutyadmin;
    private String tackid;
    private String mtype;
    private String weight;
    private String fby_id;
    private String game_id;
    private String feedback;
    private String typedir;
    private String typename;
    private String corank;
    private String isdefault;
    private String defaultname;

    @Override
    public String toString() {
        return "News{" +
                "shorttitle='" + shorttitle + '\'' +
                ", litpic='" + litpic + '\'' +
                ", source='" + source + '\'' +
                ", writer='" + writer + '\'' +
                ", color='" + color + '\'' +
                ", title='" + title + '\'' +
                ", money='" + money + '\'' +
                ", click='" + click + '\'' +
                ", arcrank='" + arcrank + '\'' +
                ", channel='" + channel + '\'' +
                ", ismake='" + ismake + '\'' +
                ", flag='" + flag + '\'' +
                ", sortrank='" + sortrank + '\'' +
                ", typeid2='" + typeid2 + '\'' +
                ", typeid='" + typeid + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public News(String id, String typeid, String typeid2, String flag, String sortrank, String ismake, String channel, String arcrank, String click, String money, String title, String shorttitle, String color, String writer, String source, String litpic, String pubdate, String senddate, String mid, String keywords) {
        this.id = id;
        this.typeid = typeid;
        this.typeid2 = typeid2;
        this.flag = flag;
        this.sortrank = sortrank;
        this.ismake = ismake;
        this.channel = channel;
        this.arcrank = arcrank;
        this.click = click;
        this.money = money;
        this.title = title;
        this.shorttitle = shorttitle;
        this.color = color;
        this.writer = writer;
        this.source = source;
        this.litpic = litpic;
        this.pubdate = pubdate;
        this.senddate = senddate;
        this.mid = mid;
        this.keywords = keywords;
    }

    public News(String id, String typeid, String typeid2, String sortrank, String flag, String ismake, String channel, String arcrank, String click, String money, String title, String shorttitle, String color, String writer, String source, String litpic) {
        this.id = id;
        this.typeid = typeid;
        this.typeid2 = typeid2;
        this.sortrank = sortrank;
        this.flag = flag;
        this.ismake = ismake;
        this.channel = channel;
        this.arcrank = arcrank;
        this.click = click;
        this.money = money;
        this.title = title;
        this.shorttitle = shorttitle;
        this.color = color;
        this.writer = writer;
        this.source = source;
        this.litpic = litpic;
    }

    public News() {
    }

    public News(String id, String typeid, String typeid2, String sortrank, String flag, String ismake, String channel, String arcrank, String click, String money, String title, String shorttitle, String color, String writer, String source, String litpic, String pubdate, String senddate, String mid, String keywords, String lastpost, String scores, String goodpost, String badpost, String voteid, String notpost, String description, String filename, String dutyadmin, String tackid, String mtype, String weight, String fby_id, String game_id, String feedback, String typedir, String typename, String corank, String isdefault, String defaultname) {
        this.id = id;
        this.typeid = typeid;
        this.typeid2 = typeid2;
        this.sortrank = sortrank;
        this.flag = flag;
        this.ismake = ismake;
        this.channel = channel;
        this.arcrank = arcrank;
        this.click = click;
        this.money = money;
        this.title = title;
        this.shorttitle = shorttitle;
        this.color = color;
        this.writer = writer;
        this.source = source;
        this.litpic = litpic;
        this.pubdate = pubdate;
        this.senddate = senddate;
        this.mid = mid;
        this.keywords = keywords;
        this.lastpost = lastpost;
        this.scores = scores;
        this.goodpost = goodpost;
        this.badpost = badpost;
        this.voteid = voteid;
        this.notpost = notpost;
        this.description = description;
        this.filename = filename;
        this.dutyadmin = dutyadmin;
        this.tackid = tackid;
        this.mtype = mtype;
        this.weight = weight;
        this.fby_id = fby_id;
        this.game_id = game_id;
        this.feedback = feedback;
        this.typedir = typedir;
        this.typename = typename;
        this.corank = corank;
        this.isdefault = isdefault;
        this.defaultname = defaultname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getTypeid2() {
        return typeid2;
    }

    public void setTypeid2(String typeid2) {
        this.typeid2 = typeid2;
    }

    public String getSortrank() {
        return sortrank;
    }

    public void setSortrank(String sortrank) {
        this.sortrank = sortrank;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIsmake() {
        return ismake;
    }

    public void setIsmake(String ismake) {
        this.ismake = ismake;
    }

    public String getArcrank() {
        return arcrank;
    }

    public void setArcrank(String arcrank) {
        this.arcrank = arcrank;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getSenddate() {
        return senddate;
    }

    public void setSenddate(String senddate) {
        this.senddate = senddate;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLastpost() {
        return lastpost;
    }

    public void setLastpost(String lastpost) {
        this.lastpost = lastpost;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public String getGoodpost() {
        return goodpost;
    }

    public void setGoodpost(String goodpost) {
        this.goodpost = goodpost;
    }

    public String getBadpost() {
        return badpost;
    }

    public void setBadpost(String badpost) {
        this.badpost = badpost;
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid;
    }

    public String getNotpost() {
        return notpost;
    }

    public void setNotpost(String notpost) {
        this.notpost = notpost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDutyadmin() {
        return dutyadmin;
    }

    public void setDutyadmin(String dutyadmin) {
        this.dutyadmin = dutyadmin;
    }

    public String getTackid() {
        return tackid;
    }

    public void setTackid(String tackid) {
        this.tackid = tackid;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFby_id() {
        return fby_id;
    }

    public void setFby_id(String fby_id) {
        this.fby_id = fby_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getTypedir() {
        return typedir;
    }

    public void setTypedir(String typedir) {
        this.typedir = typedir;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getCorank() {
        return corank;
    }

    public void setCorank(String corank) {
        this.corank = corank;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    public String getDefaultname() {
        return defaultname;
    }

    public void setDefaultname(String defaultname) {
        this.defaultname = defaultname;
    }
}
