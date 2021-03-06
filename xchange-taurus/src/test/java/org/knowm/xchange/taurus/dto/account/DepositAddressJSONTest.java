package org.knowm.xchange.taurus.dto.account;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

public class DepositAddressJSONTest {

  @Test
  public void testUnmarshal() throws IOException {
    InputStream is =
        DepositAddressJSONTest.class.getResourceAsStream(
            "/org/knowm/xchange/taurus/dto/account/example-deposit-address-response.json");

    String address = new ObjectMapper().readValue(is, String.class);

    assertThat(address).isEqualTo("1L1d4U2SALeFmsA7uxteU1QgU5FvAoUfJp");
  }
}
