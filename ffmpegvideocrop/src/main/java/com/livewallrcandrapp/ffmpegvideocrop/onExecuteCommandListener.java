package com.livewallrcandrapp.ffmpegvideocrop;

public interface onExecuteCommandListener {

    void onExecuteStart();
    void onExecuteProgress(String message);
    void onExecuteFailure(String message);
    void onExecuteSuccess(String message);
    void onExecuteFinish();
}
