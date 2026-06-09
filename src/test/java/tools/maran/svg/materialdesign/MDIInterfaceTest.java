package tools.maran.svg.materialdesign;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/// Smoke tests for {@link MDIInterface}.
///
/// @author Marius Hanl
class MDIInterfaceTest {

    @ParameterizedTest
    @EnumSource(MDIInterface.class)
    @DisplayName("Smoke test for the SVG path. Material Design SVGs always starts with an 'M'.")
    void testSvgPath(MDIInterface mdi) {
        assertNotNull(mdi.path());
        assertFalse(mdi.path().isEmpty());

        assertTrue(mdi.path().startsWith("M"));
    }

}
