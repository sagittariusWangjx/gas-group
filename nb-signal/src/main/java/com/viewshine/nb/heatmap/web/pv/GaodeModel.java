/**
 * Copyright (c) 2018-2028, Jingjing Wang (wjj821269@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viewshine.nb.heatmap.web.pv;

import com.viewshine.nb.heatmap.mapper.entity.SignalLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description
 * @Author jingjing wang
 * @Date 2020/1/9
 */
@Builder
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class GaodeModel {

    private Double lng;

    private Double lat;

    private Integer count;

    public GaodeModel truc(SignalLevel signalLevel){
        this.count = signalLevel.getSignals();
        this.lat = Double.valueOf(signalLevel.getLat());
        this.lng = Double.valueOf(signalLevel.getLng());
        return this;
    }
}
