package com.AmyLin.em.service.impl;

import com.AmyLin.em.entity.Replay;
import com.AmyLin.em.mapper.ReplayMapper;
import com.AmyLin.em.service.ReplayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 回复 服务层实现类
 *
 * @author: AmyLin
 * @date: 2024-09-30
 */
@Service
@RequiredArgsConstructor
public class ReplayServiceImpl implements ReplayService {

    private final ReplayMapper replayMapper;

    /**
     * 通过留言id查询回复
     *
     * @param messageId 留言id
     * @return 回复
     */
    @Override
    public List<Replay> findAllById(Integer messageId) {
        return replayMapper.findAllById(messageId);
    }

    /**
     * 删除回复
     *
     * @param replayId 回复id
     * @return 结果
     */
    @Override
    public Integer delete(Integer replayId) {
        return replayMapper.delete(replayId);
    }

    /**
     * 更新回复
     *
     * @param replay 回复内容
     * @return 结果
     */
    @Override
    public Integer update(Replay replay) {
        return replayMapper.update(replay);
    }

    /**
     * 添加回复
     *
     * @param replay 回复内容
     * @return 结果
     */
    @Override
    public Integer add(Replay replay) {
        return replayMapper.add(replay);
    }
}
