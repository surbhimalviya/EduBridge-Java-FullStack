import java.util.*;
class Game
{
	String getName(){
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in" +getName());
	}
}
class Soccer extends Game
{
String getName()
{
	return "soccer class";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in " +getName());
}
}
public class Sports
{
	public static void main(String[] args)
	{
	Soccer s=new Soccer();
    s.getName();
	}
}	