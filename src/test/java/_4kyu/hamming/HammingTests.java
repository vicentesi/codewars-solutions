package _4kyu.hamming;

import static org.assertj.core.api.Assertions.assertThat;
import org.example._4kyu.hamming.Hamming;
import org.junit.Test;

public class HammingTests {

  @Test
  public void Test1() {
    assertThat(Hamming.hamming(1)).isEqualTo(1);
    assertThat(Hamming.hamming(2)).isEqualTo(2);
    assertThat(Hamming.hamming(3)).isEqualTo(3);
    assertThat(Hamming.hamming(4)).isEqualTo(4);
    assertThat(Hamming.hamming(5)).isEqualTo(5);
    assertThat(Hamming.hamming(6)).isEqualTo(6);
    assertThat(Hamming.hamming(7)).isEqualTo(8);
    assertThat(Hamming.hamming(8)).isEqualTo(9);
    assertThat(Hamming.hamming(9)).isEqualTo(10);
    assertThat(Hamming.hamming(10)).isEqualTo(12);
    assertThat(Hamming.hamming(11)).isEqualTo(15);
    assertThat(Hamming.hamming(12)).isEqualTo(16);
    assertThat(Hamming.hamming(13)).isEqualTo(18);
    assertThat(Hamming.hamming(14)).isEqualTo(20);
    assertThat(Hamming.hamming(15)).isEqualTo(24);
    assertThat(Hamming.hamming(16)).isEqualTo(25);
    assertThat(Hamming.hamming(17)).isEqualTo(27);
    assertThat(Hamming.hamming(18)).isEqualTo(30);
    assertThat(Hamming.hamming(19)).isEqualTo(32);
  }

}
