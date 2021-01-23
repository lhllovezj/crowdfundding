package cn.andylhl.crowd.po;

public class OrderProjectPO {
    private String id;

    private String projectName;

    private String launchName;

    private String returnContent;

    private Integer returnCount;

    private Integer supportPrice;

    private Integer freight;

    private String orderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getLaunchName() {
        return launchName;
    }

    public void setLaunchName(String launchName) {
        this.launchName = launchName == null ? null : launchName.trim();
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }

    public Integer getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    public Integer getSupportPrice() {
        return supportPrice;
    }

    public void setSupportPrice(Integer supportPrice) {
        this.supportPrice = supportPrice;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}