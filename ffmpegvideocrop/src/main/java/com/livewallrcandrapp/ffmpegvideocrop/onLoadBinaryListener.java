package com.livewallrcandrapp.ffmpegvideocrop;

public interface onLoadBinaryListener {

    void onLoadBinaryStart(String message);
    void onLoadBinaryFailure(String message);
    void onLoadBinarySuccess(String message);
    void onLoadBinaryFinish(String message);
    void onLoadBinaryProgress(String message);
}
