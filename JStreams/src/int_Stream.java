import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class int_Stream {

	public static void main(String[] args) throws IOException {
		IntStream
			.range(1 , 11)
			.forEach(System.out::println);
		System.out.println();

	}

}
