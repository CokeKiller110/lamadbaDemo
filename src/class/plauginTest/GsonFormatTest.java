package plauginTest;

import java.util.List;

/**
 * GsonFormat 插件测试类
 */
public class GsonFormatTest {

    private String collectionNumber;
    private String collBusinessNo;
    private String payWayCode;
    private List<CreatePolicySingleListDTO> createPolicySingleList;

    public String getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(String collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public String getCollBusinessNo() {
        return collBusinessNo;
    }

    public void setCollBusinessNo(String collBusinessNo) {
        this.collBusinessNo = collBusinessNo;
    }

    public String getPayWayCode() {
        return payWayCode;
    }

    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode;
    }

    public List<CreatePolicySingleListDTO> getCreatePolicySingleList() {
        return createPolicySingleList;
    }

    public void setCreatePolicySingleList(List<CreatePolicySingleListDTO> createPolicySingleList) {
        this.createPolicySingleList = createPolicySingleList;
    }

    public static class CreatePolicySingleListDTO {
        private String certiType;
        private String certiNo;

        public String getCertiType() {
            return certiType;
        }

        public void setCertiType(String certiType) {
            this.certiType = certiType;
        }

        public String getCertiNo() {
            return certiNo;
        }

        public void setCertiNo(String certiNo) {
            this.certiNo = certiNo;
        }
    }
}