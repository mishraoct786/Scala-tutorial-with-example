package com.developerIndian.usecase

case class Leader(playerId : Int, score :Int)
class Leaderboard {
var player : List[Leader] = List()

def addScore(playerId :Int , score :Int)
{ var leader = Leader(playerId, score)
//player :+ = leader
  player = player :+ leader
}
def top(id : Int) :Int ={
var mapObj :Map[Int ,Int] = Map();
    var sum:Int = 0 ;

    for (pl <- player)
    {
     mapObj += (pl.playerId -> pl.score)
    }
    //mapObj =mapObj.s()
   var mySort =  player.sortBy (_.score).reverse
  mySort.foreach(println)
  println(id)
 for ( i <- 0 to id-1 )
    {
     sum= sum + mySort(i).score
    }
sum

}

def reset ( id: Int) : List[Leader] =
{
  var temp :Leader = null
  for(pl <- player )
    {
      if(id == pl.playerId)
      temp = Leader(pl.playerId , pl.score)
}
    var result =player.indexOf(temp)
 // println("result reset"+result+ temp )
   player = player.drop(result+1)
  player
}

}

object PlayerDemo {
  def main(args: Array[String]): Unit = {
    var  leaderboard = new Leaderboard ();

    leaderboard.addScore(1,73);   // leaderboard = [[1,73]];
    leaderboard.addScore(2,56);   // leaderboard = [[1,73],[2,56]];
    leaderboard.addScore(3,39);   // leaderboard = [[1,73],[2,56],[3,39]];
    leaderboard.addScore(4,51);   // leaderboard = [[1,73],[2,56],[3,39],[4,51]];
    leaderboard.addScore(5,4);    // leaderboard = [[1,73],[2,56],[3,39],[4,51],[5,4]];

    println(leaderboard.top(1))        // returns 73;

    leaderboard.reset(1)    // leaderboard = [[2,56],[3,39],[4,51],[5,4]];
    leaderboard.reset(2).foreach(println)        // leaderboard = [[3,39],[4,51],[5,4]];

    leaderboard.addScore(2,51);   // leaderboard = [[2,51],[3,39],[4,51],[5,4]];
    println(leaderboard.top(3))       // returns 141 = 51 + 51 + 39;
  }
}

/*
-----------------------------------------------Design a Leaderboard class, which has 3 functions:
addScore(playerId, score): Update the leaderboard by adding score to the given player's score.
If there is no player with such id in the leaderboard, add him to the leaderboard with the given score.

top(K): Return the score sum of the top K players.

reset(playerId): Reset the score of the player with the given id to 0 (in other words erase it from the leaderboard).
It is guaranteed that the player was added to the leaderboard before calling this function.

Initially, the leaderboard is empty.

Input:

["Leaderboard","addScore","addScore","addScore","addScore","addScore","top","reset","reset","addScore","top"]

[[],[1,73],[2,56],[3,39],[4,51],[5,4],[1],[1],[2],[2,51],[3]]

Output:

[null,null,null,null,null,null,73,null,null,null,141]



Explanation:

Leaderboard leaderboard = new Leaderboard ();

leaderboard.addScore(1,73);   // leaderboard = [[1,73]];

leaderboard.addScore(2,56);   // leaderboard = [[1,73],[2,56]];

leaderboard.addScore(3,39);   // leaderboard = [[1,73],[2,56],[3,39]];

leaderboard.addScore(4,51);   // leaderboard = [[1,73],[2,56],[3,39],[4,51]];

leaderboard.addScore(5,4);    // leaderboard = [[1,73],[2,56],[3,39],[4,51],[5,4]];

leaderboard.top(1);           // returns 73;

leaderboard.reset(1);         // leaderboard = [[2,56],[3,39],[4,51],[5,4]];

leaderboard.reset(2);         // leaderboard = [[3,39],[4,51],[5,4]];

leaderboard.addScore(2,51);   // leaderboard = [[2,51],[3,39],[4,51],[5,4]];

leaderboard.top(3);           // returns 141 = 51 + 51 + 39;

 */




















