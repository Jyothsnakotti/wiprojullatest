import { Directive, ElementRef, Renderer2, OnInit } from '@angular/core';

@Directive({
  selector: '[highlightStrikethru]',
  standalone: true
})
export class HighlightStrikethruDirective implements OnInit {
  constructor(private el: ElementRef, private renderer: Renderer2) {}

  ngOnInit() {
    // Set text color to yellow
    this.renderer.setStyle(this.el.nativeElement, 'color', 'yellow');
    // Set text decoration to line-through (strikethrough)
    this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'line-through');
  }
}
