package br.com.netshoes.mscliente;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MsclienteApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void quandoOsDezDigitosBaterem() {
	    Pattern pattern = Pattern.compile("^\\d{10}$");
	    Matcher matcher = pattern.matcher("2623552s");
	    assertTrue(matcher.matches());
	}

}
