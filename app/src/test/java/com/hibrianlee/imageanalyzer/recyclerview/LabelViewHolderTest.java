/*
 * Copyright (C) 2018 Brian Lee (@hiBrianLee)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hibrianlee.imageanalyzer.recyclerview;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.hibrianlee.imageanalyzer.model.LabelInfo;
import com.hibrianlee.imageanalyzer.viewmodel.LabelViewModel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LabelViewHolderTest {

    @Mock
    private LabelViewModel viewModel;

    @Mock
    private ViewDataBinding binding;

    @Mock
    private LabelInfo labelInfo;

    private LabelViewHolder holder;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        holder = new LabelViewHolder(mock(View.class), binding, viewModel);
    }

    @Test
    public void testSetData() {
        holder.setData(labelInfo);

        verify(viewModel).setLabel(labelInfo);
        verify(binding).executePendingBindings();
    }
}