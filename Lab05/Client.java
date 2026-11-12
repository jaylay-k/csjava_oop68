public class Client implements CanPay {
    private String name;
    private MemberTypeWithDiscount memberType;

    Client(String name){
        this.name = name;
        this.memberType = MemberTypeWithDiscount.NONE;
    }
    @Override
    public void spend(int direction){
        if(memberType.equals(MemberTypeWithDiscount.NONE)){
            memberType = MemberTypeWithDiscount.SILVER;
        }else if(direction > 0){
            promoteMemberType();
        }else if(direction < 0){
            demoteMemberType();
        }
        showMembershipStatus();
    }
    private void promoteMemberType(){
        MemberTypeWithDiscount [] m = MemberTypeWithDiscount.values();
        if (!memberType.equals(MemberTypeWithDiscount.PREMIUM)) {
            memberType = m[memberType.ordinal() + 1];
        }
    }
    private void demoteMemberType(){
        MemberTypeWithDiscount [] m = MemberTypeWithDiscount.values();
        if (!memberType.equals(MemberTypeWithDiscount.SILVER)) {
            memberType = m[memberType.ordinal() - 1];
        }
    }
    public void showMembershipStatus(){
        System.out.println(this.name + " is now " + this.memberType + " " + (int)(100*memberType.getProductDiscount()) + "% discount on Product " +  " discount on Service " + (int)(100*memberType.getServiceDiscount()) + "%");
    }
}
