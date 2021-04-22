package samplePrograms;

//Create all the required classes here 

class Player1{
  public static void main(String[] args){
      
  }
}
abstract class Player{
  String firstName, lastName;
  
  Player(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
  }
  
  String getName(){
      return firstName + " "+ lastName;
  }
  
  abstract int getRating();
}

class CricketPlayer extends Player{
  double averageRuns;
  
  CricketPlayer(String firstName, String secondName, double averageRuns){
      super(firstName, secondName);
      this.averageRuns = averageRuns;
  }
  
  int getRating(){
      if(averageRuns > 55) return 7;
      else if(averageRuns > 50) return 6;
      else if(averageRuns > 40) return 5;
      else if(averageRuns > 30) return 3;
      else if(averageRuns > 20) return 2;
      else return 1;
  }
}

class FootballPlayer extends Player{
  int goals;
  FootballPlayer(String firstName, String secondName, int goals){
      super(firstName, secondName);
      this.goals = goals;
  }
  
  int getRating(){
      if(goals > 20) return 5;
      else if(goals > 15) return 4;
      else if(goals > 10) return 3;
      else if(goals > 5) return 2;
      else return 1;
  }
}