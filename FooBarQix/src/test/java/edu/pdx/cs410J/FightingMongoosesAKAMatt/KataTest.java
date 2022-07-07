package edu.pdx.cs410J.FightingMongoosesAKAMatt;
import static org.hamcrest.MatcherAssert.assertThat;
import static edu.pdx.cs410J.compute;

import org.junit.jupiter.api.Test;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void divisibleByThreeWritesFoo() {
    int number = 9;
    assertThat(Compute(number), equals("Foo"));
  }
}
