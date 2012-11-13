import java.util.*;

public class Character{
  private String name;
  private int hp;
  private int skill;
  private Shield shield;
  private Weapon weapon;

  public Character(String name, int skill, Weapon weapon, Shield shield){
    this.hp = 100;
    this.name = name;
    this.skill = skill;
    this.shield = shield;
    this.weapon = weapon;
  }

  public int hit(Character annan){
    Random randomGenerator = new Random();
    int bonk = randomGenerator.nextInt(100);
    if(bonk < skill){
      int tjoff = weapon.damage() - annan.getShield();
      if(tjoff > 0){
        System.out.println(name + " hit with a damage of  " + tjoff );
        return tjoff;
      }
    }
    System.out.println(name + " missed. Klang");
    return 0;
  }

  public void dies(){
    System.out.println("nooooo!!!!");
  }

  public String getName(){
    return name;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public int getHp(){
    return hp;
  }

  public Shield getShield(){
    return shield;
  }

  public Weapon getWeapon(){
    return weapon;
  }}
