public class Game{

  private static Character setupCharacter(String mvh){
    System.out.println(mvh);
    String namn = Keyboard.readString();
    System.out.println("Skill:");
    int skill = Keyboard.readInt();
    Shield skydd = setupShield();
    Weapon vapen = setupWeapon();
    return new Character(namn, skill, vapen, skydd);
  }
   private static Shield setupShield(){
    System.out.println("Wanna have a randal shield? (ja/nej)");
    String svar = Keyboard.readString();
    if(svar.equalsIgnoreCase("ja"))
      return new Shield();
    System.out.println("Which shield do want?");
    String typ = Keyboard.readString();
    System.out.println("What's the protection of this shield ?");
    int protection = Keyboard.readInt();
    return new Shield(typ, protection);

	}
  private static Weapon setupWeapon(){
    System.out.println("Wanna have a longsword? (ja/nej)");
    String svar = Keyboard.readString();
    if(svar.equalsIgnoreCase("ja"))
      return new Weapon();
    System.out.println("Which weapon do want?");
    String typ = Keyboard.readString();
    System.out.println("What the minimum damage of this weapon ?");
    int minskada = Keyboard.readInt();
    System.out.println("and the max?");
    int maxskada = Keyboard.readInt();
    return new Weapon(typ, minskada, maxskada);
	
  }

  private static boolean fajt(Character a, Character b){
    int dam = a.hit(b);
    b.setHp(b.getHp()-dam);
    if(b.getHp() < 1){
      b.dies();
      System.out.println(a.getName() + " had slayed " + b.getName());
      System.out.println("Seems like " + a.getWeapon().getType() + " is a superior weapon.");
      return false;
    }
    return true;
  }

  public static void main(String[] args){
    System.out.println("wlecom tonight atracttion folks!!!!");
    Character a = setupCharacter("In the left corner we sees:");
    Character b = setupCharacter("and i the right");
    boolean mer = true;
    while(mer){
      mer = fajt(a, b);
      if(mer)
        mer = fajt(b, a);
    }
  }
}
 
