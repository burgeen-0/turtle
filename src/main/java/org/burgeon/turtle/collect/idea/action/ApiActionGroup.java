package org.burgeon.turtle.collect.idea.action;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import lombok.extern.slf4j.Slf4j;

/**
 * 菜单[API]
 *
 * @author luxiaocong
 * @createdOn 2021/2/10
 */
@Slf4j
public class ApiActionGroup extends DefaultActionGroup {

    /**
     * 点击菜单的时候触发
     *
     * @param e
     */
    @Override
    public void actionPerformed(AnActionEvent e) {
        log.info("Receive an [API] action.");
    }

}
