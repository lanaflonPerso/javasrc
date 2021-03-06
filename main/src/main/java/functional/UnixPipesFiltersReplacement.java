package functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A Unix replacement for:
 cat lines.txt | sort | uniq | wc -l
 * It even gives the same answer :-)
 */
public class UnixPipesFiltersReplacement {

	public static void main(String[] args) throws IOException {
		// tag::main[]
		long numberLines = Files.lines(Path.of(("lines.txt")))
			.sorted()
			.distinct()
			.count();
		System.out.println("lines.txt" + " contains " + numberLines + " unique lines.");
		// end::main[]
	}
}
