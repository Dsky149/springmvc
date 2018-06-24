package ssm.po;

public class OrderDetail {
    private  String orderId;
    private  String itemId;
    private long sl;
    private double je;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public long getSl() {
        return sl;
    }

    public void setSl(long sl) {
        this.sl = sl;
    }

    public double getJe() {
        return je;
    }

    public void setJe(double je) {
        this.je = je;
    }
}
