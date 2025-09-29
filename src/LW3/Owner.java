package LW3;

public class Owner {
    private String Ownername;
    private String PhoneNo;

    public Owner(String ownername, String phoneNo) {
        Ownername = ownername;
        PhoneNo = phoneNo;
    }

    public String getOwnername() {
        return Ownername;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setOwnername(String ownername) {
        Ownername = ownername;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
}
