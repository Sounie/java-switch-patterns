package nz.sounie.patterns;

public class TryingSwitchPatterns {
    public String doMatchStuff(Object thing) {
        // Pattern matching switch uses -> arrow syntax
        // Cannot mix and match a literal value alongside pattern
        return switch (thing) {
            case Integer i ->
                // Literal matching
                switch (i) {
                    case 100 -> "Int value 100";
                    case 500 -> "Int value 500";
                    default -> "Hello int " + i;
                };

            case Number n ->  "Some non-int number " + n;
            default -> "Didn't find a match, so defaulting";
        };
    }
}
