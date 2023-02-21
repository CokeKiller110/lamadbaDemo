package md5;

public class MD5Test {

    public static class RequestDto {
        private String businessNo;
        private String businessType;
        private String businessOffice;
        private String productCode;
        private String classCode;
        private String startTime;
        private String endTime;

        public String getBusinessNo() {
            return businessNo;
        }

        public void setBusinessNo(String businessNo) {
            this.businessNo = businessNo;
        }

        public String getBusinessType() {
            return businessType;
        }

        public void setBusinessType(String businessType) {
            this.businessType = businessType;
        }

        public String getBusinessOffice() {
            return businessOffice;
        }

        public void setBusinessOffice(String businessOffice) {
            this.businessOffice = businessOffice;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getClassCode() {
            return classCode;
        }

        public void setClassCode(String classCode) {
            this.classCode = classCode;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) {
        RequestDto requestDto = new RequestDto();
        requestDto.setBusinessNo("66052120221721TEST");
        requestDto.setBusinessType("66");
        requestDto.setBusinessOffice("11000000");
        requestDto.setProductCode("0521");
        requestDto.setClassCode("05");
        requestDto.setStartTime("2022-05-18");
        requestDto.setEndTime("2023-05-18");
    }
}
