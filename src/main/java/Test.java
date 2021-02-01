public class Test {
    @TestAllow
    public void A(Func f){
      f.doSmth();
    }
    public void B(){

    }
    @TestAllow
    public void C(Func f){
        f.doSmth();
    }
}
