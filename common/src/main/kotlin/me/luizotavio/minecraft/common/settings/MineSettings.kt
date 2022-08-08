/*
 * MIT License
 *
 * Copyright (c) [2022] [LUIZ O. F. CORRÊA]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.luizotavio.minecraft.common.settings

import org.bukkit.Material
import org.bukkit.World
import java.util.EnumSet
import java.util.UUID

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
interface MineSettings {

    fun getOwner(): UUID

    /**
     * The size multiplied by the number of blocks per column. (5x5 = 25)
     */
    fun getSize(): Int

    fun getBlockTypes(): EnumSet<Material>

    fun setBlockTypes(blockTypes: EnumSet<Material>)

    fun hasBlockType(blockType: Material): Boolean

    fun getPrice(size: Int): Int

    fun getMembers(): MutableSet<UUID>

    fun perform(member: UUID, type: PerformType): Boolean

    fun onUpgrade(world: World, fromSize: Int, toSize: Int)

    enum class PerformType {
        CHECK_IF_EXISTS,
        INSERT_MEMBER_IN_LIST,
        REMOVE_MEMBER_FROM_LIST,
    }

}