package org.burgeon.turtle.core.event.source;

/**
 * 事件来源：Visual Studio Code
 *
 * @author luxiaocong
 * @createdOn 2021/4/19
 */
public class VsCodeEventSource extends EventSource {

    @Override
    public int getCode() {
        return 103;
    }

    @Override
    public String getName() {
        return "vscode";
    }

}
