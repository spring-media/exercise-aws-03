package de.welt;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    @Test
    public void foo() {
        assertThat(true).as("This doesn't make sense.").isTrue();
    }
}
