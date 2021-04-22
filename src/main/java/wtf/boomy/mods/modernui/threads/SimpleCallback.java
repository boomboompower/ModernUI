/*
 *     Copyright (C) 2021 boomboompower
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package wtf.boomy.mods.modernui.threads;

/**
 * Simple callback class
 *
 * @param <T> the type of data to receive
 *
 * @author boomboompower
 * @since 3.0.0
 */
public interface SimpleCallback<T> {
    
    /**
     * Runs the callback and provides the associated data
     *
     * @param data the data to receive once the callback is run
     */
    public abstract void run(T data);
    
    /**
     * Called when this callback is cancelled
     */
    public default void onCancel() {
    }
    
    /**
     * Called when an error occurs while running this callback
     *
     * @param message the message from the error
     */
    public default void onError(String message) {
    }
    
}
