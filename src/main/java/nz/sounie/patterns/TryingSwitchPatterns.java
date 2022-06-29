package nz.sounie.patterns;

public class TryingSwitchPatterns {
    public String doMatchStuff(Object thing) {
        // Pattern matching switch uses -> arrow syntax
        // Cannot mix and match a literal value alongside pattern
        return switch (thing) {
            case Integer i ->
                // Literal matching can be applied in separate switch, where we know the type
                switch (i) {
                    case 100, 500 -> "Int value " + i;
                    default -> "Hello int " + i;
                };

            case Number n ->  "Some non-int number " + n;
            case null -> "Found a null"; // Example of something that won't match as 'default'
            default -> "Didn't find a match, so defaulting";
        };
    }
}
