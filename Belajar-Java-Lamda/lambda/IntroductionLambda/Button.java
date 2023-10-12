package IntroductionLambda;

public class Button {   
    private McDonald action;
    
    public void setOrderedAction(McDonald action){
        this.action = action;
    }
        
    public void doOrder(){
        action.onOrder("McFlurry with Oreo", 1);
    }
}
