import { Component, Input, Output, EventEmitter } from '@angular/core';
import { ITask } from '../models/task.interface';

@Component({
  selector: 'task',
  standalone: true,
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent {
  @Input() task!: ITask;
  @Output() delete = new EventEmitter<number>();

  onDelete() {
    this.delete.emit(this.task.id);
  }
}
