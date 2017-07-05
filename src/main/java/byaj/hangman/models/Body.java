package byaj.hangman.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by student on 7/5/17.
 */
@Entity
public class Body {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String newGame = "Ready to Play?";
    private String tree = "tree";
    private String noose = "noose";
    private String head = "head";
    private String neck = "neck";
    private String rightArm = "right arm";
    private String leftArm = "left arm";
    private String torso = "torso";
    private String rightLeg = "right leg";
    private String leftLeg = "left leg";
    private String ground = "ground";
    private int iterateNum = 0;
    /*
    private boolean showHead;
    private boolean showNeck;
    private boolean showRightArm;
    private boolean showLeftArm;
    private boolean showRightLeg;
    private boolean showLeftLeg;
    */
    
    public int getID(){
        return id;
    }
    public String getNewGame(){
        return newGame;
    }
    public void setNewGame(String newGame){
        this.newGame = newGame;
    }
    public String getTree(){
        return tree;
    }
    public void setTree(String tree){
        this.tree = tree;
    }
    public String getNoose(){
        return noose;
    }
    public void setNoose(String noose){
        this.noose = noose;
    }
    public String getHead(){
        return head;
    }
    public void setHead(String head){
        this.head = head;
    }
    public String getNeck(){
        return neck;
    }
    public void setNeck(String neck){
        this.neck = neck;
    }
    public String getRightArm(){
        return rightArm;
    }
    public void setRightArm(String rightArm){
        this.rightArm = rightArm;
    }
    public String getLeftArm(){
        return leftArm;
    }
    public void setLeftArm(String leftArm){
        this.leftArm = leftArm;
    }
    public String getTorso(){
        return torso;
    }
    public void setTorso(String torso){
        this.torso = torso;
    }
    public String getRightLeg(){
        return rightLeg;
    }
    public void setRightLeg(String rightLeg){
        this.rightLeg = rightLeg;
    }
    public String getLeftLeg(){
        return leftLeg;
    }
    public void setLeftLeg(String leftLeg){
        this.leftLeg = leftLeg;
    }
    public String getGround(){
        return ground;
    }
    public void setGround(String ground){
        this.ground = ground;
    }
    public int getIterateNum(){
        return iterateNum;
    }
    public void setIterateNum(int iterateNum){
        this.iterateNum = iterateNum;
    }

   /* public boolean getShowHead(){
        return showHead;
    }
    public void setShowHead(boolean showHead){
        this.showHead = showHead;
    }
    public boolean getShowNeck(){
        return showNeck;
    }
    public void setShowNeck(boolean showNeck){
        this.showNeck = showNeck;
    }
    public boolean getShowRightArm(){
        return showRightArm;
    }
    public void setShowRightArm(boolean showRightArm){
        this.showRightArm = showRightArm;
    }
    public boolean getShowLeftArm(){
        return showLeftArm;
    }
    public void setShowLeftArm(boolean showLeftArm){
        this.showLeftArm = showLeftArm;
    }
    public boolean getShowRightLeg(){
        return showRightLeg;
    }
    public void setShowRightLeg(boolean showRightLeg){
        this.showRightLeg = showRightLeg;
    }
    public boolean getShowLeftLeg(){
        return showLeftLeg;
    }
    public void setShowLeftLeg(boolean showLeftLeg){
        this.showLeftLeg = showLeftLeg;
    }
    */
    public String showBody() {


            switch (iterateNum) {
                case 0:
                    return newGame;
                case 1:
                    return tree;
                case 2:
                    return noose;
                case 3:
                    return head;
                case 4:
                    return neck;
                case 5:
                    return rightArm;
                case 6:
                    return leftArm;
                case 7:
                    return torso;
                case 8:
                    return rightLeg;
                case 9:
                    return leftLeg;
                case 10:
                    return ground;
            }

            return "insert error url here";
    }
    public void countIterateNum(){
        iterateNum++;
    }
    /*
    public void bodySwitch(int iterateNum){
        do {
            if (iterateNum == 1) {
                showHead = true;
                continue;
            }
            switch (iterateNum) {

                case 2:
                    showHead = false;
                    showNeck = true;
                    showRightArm = false;
                    showLeftArm = false;
                    showRightLeg = false;
                    showLeftLeg = false;
                    break;
                case 3:
                    showHead = false;
                    showNeck = false;
                    showRightArm = true;
                    showLeftArm = false;
                    showRightLeg = false;
                    showLeftLeg = false;
                    break;
                case 4:
                    showHead = false;
                    showNeck = false;
                    showRightArm = false;
                    showLeftArm = true;
                    showRightLeg = false;
                    showLeftLeg = false;
                    break;
                case 5:
                    showHead = false;
                    showNeck = false;
                    showRightArm = false;
                    showLeftArm = false;
                    showRightLeg = true;
                    showLeftLeg = false;
                    break;
                case 6:
                    showHead = false;
                    showNeck = false;
                    showRightArm = false;
                    showLeftArm = false;
                    showRightLeg = false;
                    showLeftLeg = true;
                    break;
            }
        }while(false);
    }
    */
}
