package launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.late.core.fragments.LatteFragment;
import com.late.core.ui.launcher.LauncherHolderCreator;
import com.late.core.ui.launcher.ScrollLauncherTag;
import com.late.core.util.storage.LattePreference;
import com.latte.ec.R;

import java.util.ArrayList;

/**
 * Created by ywz on 18-11-24.
 * Describe:
 */
public class LauncherScrollDelegate extends LatteFragment implements OnItemClickListener {

    private ConvenientBanner<Integer> mConvenientBanner = null;
    private static final ArrayList<Integer> INTEGERS = new ArrayList<>();


    private void initBanner() {
        if (INTEGERS.isEmpty()) {
            INTEGERS.add(R.mipmap.launcher_01);
            INTEGERS.add(R.mipmap.launcher_02);
            INTEGERS.add(R.mipmap.launcher_03);
            INTEGERS.add(R.mipmap.launcher_04);
            INTEGERS.add(R.mipmap.launcher_05);
        }

        mConvenientBanner
                .setPages(new LauncherHolderCreator(), INTEGERS)
                .setPageIndicator(new int[]{R.drawable.dot_normal, R.drawable.dot_focus})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setOnItemClickListener(this)
                .setCanLoop(false);
    }

    @Override
    public Object setLayout() {
        mConvenientBanner = new ConvenientBanner<>(getContext());
        return mConvenientBanner;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initBanner();
    }

    @Override
    public void onItemClick(int position) {
        //如果点击的是最后一个
        if (position == INTEGERS.size() - 1) {
            LattePreference.setAppFlag(ScrollLauncherTag.HAS_FIRST_LAUNCHER_APP.name(), true);
            //检查用户是否已经登录
        }
    }
}
