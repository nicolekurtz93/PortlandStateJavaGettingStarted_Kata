package edu.pdx.cs410J.FightingMongoosesAKAMatt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class KataTest {

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void divisibleByThreeWritesFoo() {
    String number = "9";
    assertThat(Kata.compute(number), equalTo("Foo"));
  }

  @Test
  void divisibleByFiveWriteBar() {
    String number = "10";
    assertThat(Kata.compute(number), equalTo("Bar"));
  }

  @Test
  void divisibleBySevenWriteQix(){
    String number = "14";
    assertThat(Kata.compute(number), equalTo("Qix"));
  }

  @Test
  void ifNumberIsThreeReturnFooFoo()
  {
    String number = "3";
    assertThat(Kata.compute(number), equalTo("FooFoo"));
  }

  @Test
  void ifNumberIsFiveReturnBarBar()
  {
    String number = "5";
    assertThat(Kata.compute(number), equalTo("BarBar"));
  }

  @Test
  void ifNumberIsSevenReturnQixQix()
  {
    String number = "7";
    assertThat(Kata.compute(number), equalTo("QixQix"));
  }

  @Test
  void ifNumberIsOneReturnOne()
  {
    String number = "1";
    assertThat(Kata.compute(number), equalTo("1"));
  }

  @Test
  void ifNumberIsTwoReturnTwo()
  {
    String number = "2";
    assertThat(Kata.compute(number), equalTo("2"));
  }
}
