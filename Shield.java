import java.util.*;
// Hej Simon / rami
public class Shield{
  private String type;
  private int protection;
  

  public Shield(){
    type = "randal";
    protection = 30;
  }

  public Shield(String type, int protection){
    this.type = type;
    this.protection = protection;
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType(){
    return type;
  }


  public void setProtection(int protection){
    this.protection = protection;
  }

  public int getProtection(){
    return protection;
  }

}
