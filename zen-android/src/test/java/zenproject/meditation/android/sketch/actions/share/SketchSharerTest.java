package zenproject.meditation.android.sketch.actions.share;

import android.content.Intent;
import android.net.Uri;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import zenproject.meditation.android.ContextRetriever;
import zenproject.meditation.android.ZenTestBase;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SketchSharerTest extends ZenTestBase {
    @Mock
    private ScreenshotTaker screenshotTaker;
    @Captor
    private ArgumentCaptor<Intent> intentCaptor;

    private SketchSharer sketchSharer;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(screenshotTaker.takeScreenshot()).thenReturn(mock(Uri.class));

        sketchSharer = new SketchSharer(screenshotTaker);
    }
    
    @Ignore("This test requires being able to test an intent, will eventually fail")
    @Test
    public void testThatShareSketchStartsActivityWithActionChooser() {
        sketchSharer.shareSketch();

        verify(ContextRetriever.INSTANCE.getActivity()).startActivity(intentCaptor.capture());

        assertThat(intentCaptor.getValue().getAction()).isEqualTo(Intent.ACTION_CHOOSER);
    }

    @Test
    public void testThatNewInstanceReturnsNotNullSketchSharer() {
        assertThat(SketchSharer.newInstance()).isNotNull();
    }

    @Test
    public void testThatNewInstanceReturnsANewInstance() {
        SketchSharer secondInstance = SketchSharer.newInstance();
        SketchSharer firstInstance = SketchSharer.newInstance();

        assertThat(firstInstance).isNotEqualTo(secondInstance);
    }
}
