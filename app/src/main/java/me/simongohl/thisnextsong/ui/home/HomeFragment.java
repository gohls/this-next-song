package me.simongohl.thisnextsong.ui.home;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import me.simongohl.thisnextsong.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private AudioManager mAudioManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mAudioManager = (AudioManager) this.getContext().getSystemService(Context.AUDIO_SERVICE);
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            view.findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_PLAY);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        System.out.println("PLAY");
                        mAudioManager.dispatchMediaKeyEvent(event);
                    }
                }
            });

            view.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_MEDIA_PREVIOUS);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        System.out.println("BACK");
                        mAudioManager.dispatchMediaKeyEvent(event);
                    }
                }
            });

            view.findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_MEDIA_NEXT);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        System.out.println("NEXT");
                        mAudioManager.dispatchMediaKeyEvent(event);
                    }
                }
            });

            view.findViewById(R.id.btn_pause).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_MEDIA_PAUSE);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        System.out.println("NEXT");
                        mAudioManager.dispatchMediaKeyEvent(event);
                    }
                }
            });
        }
}