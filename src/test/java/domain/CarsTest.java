package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarsTest {

    @Test
    @DisplayName("자동차들의 이름을 인자 받아 이름 수 만큼의 자동차를 생성한다.")
    void create() {
        //given //when
        Cars cars = new Cars("pobi", "nana", "ppo");

        //then
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 수가 2개 미만일 경우, 예외가 발생한다.")
    void validateSize() {
        //given //when //then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Cars("pobi"))
                .withMessage("자동차의 대수는 최소 1대 이상이여야 합니다.");
    }
}
