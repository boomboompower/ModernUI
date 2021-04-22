package wtf.boomy.mods.modernui.uis.faces;

/**
 * Represents an element which supports being drawn in either the legacy mode (with textures) or
 * in the modern mode (with simple rectangles).
 *
 * @author boomboompower
 */
public interface SkinnedUIElement {
    
    /**
     * Informs this element to render using the specified attribute.
     *
     * @param modern true if this button should render using modern mode, or false if not
     * @return this element being modified
     */
    public <T extends SkinnedUIElement> T setDrawingModern(boolean modern);
    
    /**
     * Returns true if this element is currently drawing in modern mode.
     *
     * @return true if this element is using modern mode
     */
    public boolean isDrawingModern();
}
