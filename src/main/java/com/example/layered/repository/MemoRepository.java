package com.example.layered.repository;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;
import com.example.layered.entity.Memo;
import com.example.layered.service.MemoService;

import java.util.List;

public interface MemoRepository {

    Memo saveMemo(Memo memo);

    List<MemoResponseDto> findAllMemos();

    Memo findMemoById(Long id);

    void deleteMemo(Long id);


}
