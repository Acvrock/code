package com.wolfjc.code.generator.template.generate;

import com.wolfjc.code.generator.template.TemplateInfo;

import java.util.Collection;

/**
 *
 */
public interface FileGenerate {

    /**
     * 生成目标文件
     *
     * @param templateInfo
     */
    void generate(TemplateInfo templateInfo);

    /**
     * 批量生成目标文件
     *
     * @param templateInfos
     */
    void generate(Collection<TemplateInfo> templateInfos);
}
