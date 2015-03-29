package zenproject.meditation.android.sketch.performers.flowers;

import com.juankysoriano.rainbow.core.drawing.RainbowDrawer;
import com.juankysoriano.rainbow.core.graphics.RainbowImage;
import com.juankysoriano.rainbow.utils.RainbowMath;

import java.util.ArrayList;
import java.util.List;

import zenproject.meditation.android.R;

public class CherryDrawer extends FlowerDrawer {
    private static final int NUM_FLOWERS = 5;

    public static FlowerDrawer newInstance(RainbowDrawer rainbowDrawer) {
        CherryDrawer cherryDrawer = new CherryDrawer(new ArrayList<RainbowImage>(NUM_FLOWERS), rainbowDrawer);
        rainbowDrawer.loadImage(R.drawable.cherry_1, RainbowImage.LOAD_ORIGINAL_SIZE, cherryDrawer);
        rainbowDrawer.loadImage(R.drawable.cherry_2, RainbowImage.LOAD_ORIGINAL_SIZE, cherryDrawer);
        rainbowDrawer.loadImage(R.drawable.cherry_3, RainbowImage.LOAD_ORIGINAL_SIZE, cherryDrawer);
        rainbowDrawer.loadImage(R.drawable.cherry_4, RainbowImage.LOAD_ORIGINAL_SIZE, cherryDrawer);
        rainbowDrawer.loadImage(R.drawable.cherry_5, RainbowImage.LOAD_ORIGINAL_SIZE, cherryDrawer);

        return cherryDrawer;
    }

    private CherryDrawer(List<RainbowImage> flowerImages, RainbowDrawer rainbowDrawer) {
        super(flowerImages, rainbowDrawer);
    }

    @Override
    protected float getFlowerSize() {
        return RainbowMath.random(MIN_FLOWER_SIZE / 4, MAX_FLOWER_SIZE / 4);
    }


}