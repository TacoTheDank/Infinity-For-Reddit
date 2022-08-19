package ml.docilealligator.infinityforreddit.customviews;

import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import ml.docilealligator.infinityforreddit.R;

public class LandscapeExpandedRoundedBottomSheetDialogFragment extends BottomSheetDialogFragment {
    @Override
    public void onStart() {
        super.onStart();
        View parentView = (View) requireView().getParent();
        BottomSheetBehavior.from(parentView).setState(BottomSheetBehavior.STATE_EXPANDED);
        BottomSheetBehavior.from(parentView).setSkipCollapsed(true);
    }

    @Override
    public int getTheme() {
        return R.style.CustomBottomSheetDialogStyle;
    }
}
