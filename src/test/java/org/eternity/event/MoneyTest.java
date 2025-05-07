package org.eternity.event;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {
    @Test
    public void ceil() {
        Money amount = Money.wons(1111);

        assertThat(amount.ceil(0.01)).isEqualTo(Money.wons(12));
    }

    @Test
    public void times() {
        Money amount = Money.wons(1111);
        assertThat(Math.ceil(amount.times(0.01).doubleValue())).isEqualTo(12);
    }
}
